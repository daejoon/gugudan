package d2.models

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "EXAM_HIST_MASTER")
class EXAM_HIST_MASTER(
        @Id
        @Column(name = "ID", nullable = false)
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long,

        @Column(name = "OPER_TYPE", nullable = false)
        var oper_type: String,

        @Column(name = "LEVEL", nullable = false)
        var level: String,

        @Column(name = "EXAM_COUNT", nullable = false)
        var exam_count: Int,

        @Column(name = "SCORE", nullable = false)
        var score: Int,

        @Column(name = "TEST_TIME", nullable = false)
        var test_time: Long,

        @Column(name = "CREATE_DATETIME", nullable = false)
        var create_datetime: Date,

        @Column(name = "UPDATE_DATETIME", nullable = false)
        var update_datetime: Date
)