package d2.repositories

import d2.models.EXAM_HIST_DETAIL
import d2.models.QEXAM_HIST_DETAIL
import d2.models.QEXAM_HIST_MASTER
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport
import org.springframework.data.querydsl.QuerydslPredicateExecutor
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

interface ExamDetailQueryDslRepository {
    fun list() : List<EXAM_HIST_DETAIL>
}

interface ExamDetailRepository : ExamDetailQueryDslRepository, JpaRepository<EXAM_HIST_DETAIL, Long>, QuerydslPredicateExecutor<EXAM_HIST_DETAIL>


@Transactional
@Repository
class ExamDetailRepositoryImpl : QuerydslRepositorySupport(EXAM_HIST_DETAIL::class.java), ExamDetailQueryDslRepository {
    override fun list(): List<EXAM_HIST_DETAIL> {
        val detail = QEXAM_HIST_DETAIL.eXAM_HIST_DETAIL
        val master = QEXAM_HIST_MASTER.eXAM_HIST_MASTER

        return from(detail)
                .leftJoin(detail.master, master).fetchJoin()
                .fetch()
    }
}




