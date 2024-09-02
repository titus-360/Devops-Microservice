package visitoron.app.service.impl

import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service
import visitoron.app.models.user.User
import visitoron.app.repository.UserRepository
import visitoron.app.service.UserService

/**
 *
 * @author Titus Murithi Bundi
 */
@Service("userService")
class UserServiceImpl(private val userRepository: UserRepository, private val passwordEncoder: PasswordEncoder) :
    UserService {


    override fun saveUser(user: User) {
        user.password = passwordEncoder.encode(user.password)
        log.info("Saving user with details {}", user.toString())
        userRepository.save(user)
    }

    override fun findByEmail(email: String): User? {
        return userRepository.findByEmail(email)
    }

    companion object {
        private val log = org.slf4j.LoggerFactory.getLogger(UserServiceImpl::class.java)
    }
}
