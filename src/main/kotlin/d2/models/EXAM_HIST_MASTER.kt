package d2.models

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "EXAM_HIST_MASTER")
data class EXAM_HIST_MASTER(
        @Id
        @Column(name = "ID", nullable = false)
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long? = null,

        @Column(name = "OPER_TYPE", nullable = false)
        val oper_type: String? = null,

        @Column(name = "LEVEL", nullable = false)
        val level: String? = null,

        @Column(name = "EXAM_COUNT", nullable = false)
        val exam_count: Int? = null,

        @Column(name = "SCORE", nullable = false)
        val score: Int? = null,

        @Column(name = "TEST_TIME", nullable = false)
        val test_time: Long? = null,

        @Column(name = "CREATE_DATETIME", nullable = false)
        val create_datetime: Date? = null,

        @Column(name = "UPDATE_DATETIME", nullable = false)
        val update_datetime: Date? = null
)