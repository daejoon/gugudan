package d2.models

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "EXAM_HIST_DETAIL")
data class EXAM_HIST_DETAIL(
        @Id
        @Column(name = "ID", nullable = false)
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long? = null,

        @Column(name = "QUESTION", nullable = false)
        val QUESTION: String? = null,

        @Column(name = "ANSWER", nullable = false)
        val ANSWER: String? = null,

        @Column(name = "RESULT", nullable = false)
        val RESULT: String? = null,

        @ManyToOne(targetEntity = EXAM_HIST_MASTER::class, fetch = FetchType.LAZY)
        @JoinColumn(name = "EXAM_HIST_MASTER_ID", referencedColumnName = "ID", nullable = false)
        val master: EXAM_HIST_MASTER? = null,

        @Column(name = "CREATE_DATETIME", nullable = false)
        val create_datetime: Date? = null,

        @Column(name = "UPDATE_DATETIME", nullable = false)
        val update_datetime: Date? = null
)