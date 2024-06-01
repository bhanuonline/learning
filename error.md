Error:Web server failed to start. Port 8080 was already in use.
Solution: lsof -i :8080 ,kill -9 <PID>
Error :Not a managed type: class com.example.demo.model.User
Solution: Add @Entity to the class use jakarta.persistence.Entity package


