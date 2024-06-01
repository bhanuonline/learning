Error:Web server failed to start. Port 8080 was already in use.
Solution: lsof -i :8080 ,kill -9 <PID>
