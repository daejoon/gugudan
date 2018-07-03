package d2

import mu.KLogging
import org.springframework.boot.Banner
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.info.BuildProperties
import org.springframework.context.annotation.Bean
import org.springframework.core.env.Environment
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 *   ________ ____ ___  ________ ____ ___________      _____    _______
 *  /  _____/|    |   \/  _____/|    |   \______ \    /  _  \   \      \
 * /   \  ___|    |   /   \  ___|    |   /|    |  \  /  /_\  \  /   |   \
 * \    \_\  \    |  /\    \_\  \    |  / |    `   \/    |    \/    |    \
 *  \______  /______/  \______  /______/ /_______  /\____|__  /\____|__  /
 *         \/                 \/                 \/         \/         \/
 *
 * @See <a href="http://patorjk.com/software/taag/#p=display&f=Graffiti&t=GUGUDAN">http://patorjk.com/</>
 *
 * @Author kdj
 * @Date 2018. 3. 1.
 */
@RestController
@SpringBootApplication
class Application(val env: Environment, val buildInfo: BuildProperties) {
    companion object : KLogging()

    @Bean
    fun init() = CommandLineRunner {
        logger.info("Profile: '{}'", env.activeProfiles)
        logger.info("Version: '{}'", buildInfo.version)
    }

    @GetMapping(value = ["/version"])
    fun version() = "Gugudan v${buildInfo.version}"
}

fun main(args: Array<String>) {
    SpringApplicationBuilder(Application::class.java)
            .sources(Application::class.java)
            .bannerMode(Banner.Mode.LOG)
            .run(*args)
}
