import base64
import json
import urllib.request

# Configuration
BEARER_TOKEN = "eyJjbGVhcmVkIjozLCJleHAiOjE3ODg2MTA5NTYsImlhdCI6MTc4ODQzODk3NSwicmVmIjoiNzNjOGM1MjIxYjg0MjE4ZiJ9.OnJe91mWD8ISumqVbXYETQ"
URL = "https://workwithus.staging.scalerailabs.com/g/c8jFIhuEIY8FGW8bmQDY"

headers = {"Authorization": f"Bearer {BEARER_TOKEN}"}

try:
    # 1. Fetch questions and trivia token
    req = urllib.request.Request(URL, headers=headers)
    with urllib.request.urlopen(req) as response:
        res_data = json.loads(response.read().decode())

    jwt_token = res_data["token"]
    print("[+] Fetched trivia token successfully.")

    # 2. Extract answers from JWT payload
    payload_b64 = jwt_token.split(".")[1]
    payload_b64 += "=" * ((4 - len(payload_b64) % 4) % 4)
    payload = json.loads(base64.urlsafe_b64decode(payload_b64).decode("utf-8"))
    answers = payload["a"]
    print(f"[+] Extracted answers: {answers}")

    # 3. Submit answers within the timer window
    post_headers = {
        "Authorization": f"Bearer {BEARER_TOKEN}",
        "Content-Type": "application/json",
    }
    submit_body = json.dumps({"token": jwt_token, "answers": answers}).encode(
        "utf-8"
    )

    post_req = urllib.request.Request(
        URL, data=submit_body, headers=post_headers, method="POST"
    )
    with urllib.request.urlopen(post_req) as response:
        result = json.loads(response.read().decode())
        print("\n[+] SERVER SUCCESS RESPONSE:\n")
        print(json.dumps(result, indent=2))

except Exception as e:
    print(f"[-] Error: {e}")