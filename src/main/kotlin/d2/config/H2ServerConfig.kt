package d2.config

import com.zaxxer.hikari.HikariDataSource
import mu.KLogging
import org.h2.tools.Server
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.jdbc.DataSourceBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.DependsOn
import org.springframework.context.annotation.Profile
import java.sql.SQLException
import javax.sql.DataSource

/**
 * H2ServerConfig
 *
 * Created by kdj on 2018. 7. 2.
 */
@Configuration
class H2ServerConfig {
    companion object : KLogging()

    @Bean
    @ConfigurationProperties("spring.datasource.hikari")
    @Profile(DEFINE.NOT_PRODUCTION)
    @DependsOn("server")
    fun dataSource(): DataSource {
        return DataSourceBuilder.create().type(HikariDataSource::class.java).build()
    }

    @Bean(initMethod = "start", destroyMethod = "stop")
    @Profile(DEFINE.NOT_PRODUCTION)
    @Throws(SQLException::class)
    fun server(): Server {
        return Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", "9092")
    }
}