package d2.mvc.home

import d2.repository.ExamDetailRepository
import d2.repository.ExamMasterRepository
import mu.KLogging
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

/**
 * @Author kdj
 * @Date 2018. 3. 1.
 */

@Controller
class HomeController(
        val examMasterRepository: ExamMasterRepository,
        val examDetailRepository: ExamDetailRepository
) {
    companion object : KLogging()

    @GetMapping(value = ["", "/ "])
    fun hello() = "home"

    @GetMapping(value = ["/master"])
    @ResponseBody
    fun master() = examMasterRepository.list()

    @GetMapping(value = ["/detail"])
    @ResponseBody
    fun detail() = examDetailRepository.list()
}