package visitoron.app.service

import visitoron.app.models.user.User

/**
 *
 * @author Titus Murithi Bundi
 */

interface UserService {
    fun saveUser(user : User)

    fun findByEmail(email: String): User?
}
