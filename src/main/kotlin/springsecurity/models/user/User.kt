package visitoron.app.models.user

import jakarta.persistence.*
import lombok.NoArgsConstructor

/**
 *
 * @author Titus Murithi Bundi
 */
@Entity
@NoArgsConstructor
@Table(name = "users")
data class User(

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user-seq")
    @SequenceGenerator(name = "user-seq", sequenceName = "user_seq", allocationSize = 1)
    var id: Long? = null,

    @Column(nullable = false, unique = true)
    val username: String? = null,

    @Column(nullable = false)
    var password: String? = null,

    @Column(nullable = false, unique = true)
    val email: String? = null,

    @Column(nullable = false)
    val phoneNumber: String? = null,

    @Column(nullable = false)
    val firstName: String? = null,

    @Column(nullable = false)
    val lastName: String? = null,

    @Column(nullable = false)
    val businessType: String? = null,


    )
