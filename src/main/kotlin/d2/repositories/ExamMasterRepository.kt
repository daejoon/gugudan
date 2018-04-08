package d2.repositories

import d2.models.EXAM_HIST_MASTER
import d2.models.QEXAM_HIST_MASTER
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport
import org.springframework.data.querydsl.QuerydslPredicateExecutor
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

interface ExamMasterQueryDslRepository {
    fun list() : List<EXAM_HIST_MASTER>
}

interface ExamMasterRepository : ExamMasterQueryDslRepository, JpaRepository<EXAM_HIST_MASTER, Long>, QuerydslPredicateExecutor<EXAM_HIST_MASTER>


@Transactional
@Repository
class ExamMasterRepositoryImpl : QuerydslRepositorySupport(EXAM_HIST_MASTER::class.java), ExamMasterQueryDslRepository {

    override fun list(): List<EXAM_HIST_MASTER> {
        val master = QEXAM_HIST_MASTER.eXAM_HIST_MASTER
        return from(master)
                .fetch()
    }
}
