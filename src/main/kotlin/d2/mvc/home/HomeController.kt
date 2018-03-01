package d2.mvc.home

import mu.KLogging
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

/**
 * @Author kdj
 * @Date 2018. 3. 1.
 */

@Controller
class HomeController {
    companion object : KLogging()

    @GetMapping(value = arrayOf("", "/"))
    fun hello() = "home"
}