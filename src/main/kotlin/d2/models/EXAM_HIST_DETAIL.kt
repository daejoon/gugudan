package d2.models

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "EXAM_HIST_DETAIL")
class EXAM_HIST_DETAIL(
        @Id
        @Column(name = "ID", nullable = false)
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long,

        @Column(name = "QUESTION", nullable = false)
        var QUESTION: String,

        @Column(name = "ANSWER", nullable = false)
        var ANSWER: String,

        @Column(name = "RESULT", nullable = false)
        var RESULT: String,

        @ManyToOne(targetEntity = EXAM_HIST_MASTER::class, fetch = FetchType.LAZY)
        @JoinColumn(name = "EXAM_HIST_MASTER_ID", referencedColumnName = "ID", nullable = false)
        var master: EXAM_HIST_MASTER,

        @Column(name = "CREATE_DATETIME", nullable = false)
        var create_datetime: Date,

        @Column(name = "UPDATE_DATETIME", nullable = false)
        var update_datetime: Date
)