package visitoron.app.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import visitoron.app.models.user.User
import visitoron.app.service.UserService

/**
 *
 * @author Titus Murithi Bundi
 */
@RestController
@RequestMapping("/auth")
class AuthController(private val userService: UserService) {

    @PostMapping("/signup")
    fun signUp(@RequestBody user: User): ResponseEntity<User> {
        userService.saveUser(user)
        return ResponseEntity.ok(user)
    }

    @PostMapping("/sign-in")
    fun login(@RequestParam userEmail: String, @RequestParam password : String): String {
      val user = userService.findByEmail(userEmail)
        return if (user != null && user.password == password) {
            "Login successful"
        } else {
            "Invalid credentials"
        }
    }
}

