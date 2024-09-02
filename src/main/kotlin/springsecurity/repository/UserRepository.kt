package visitoron.app.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import visitoron.app.models.user.User

/**
 *
 * @author Titus Murithi Bundi
 */
@Repository
interface UserRepository : JpaRepository<User, Long> {
    fun findByEmail(email: String): User?

}
