package it.redbyte.linkedin

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

@Configuration
//@EnableConfigurationProperties(OAuth2Props::class)
//@ConditionalOnClass(UserDetails::class)
@Import()
open class RedLinkedinClientAutoConfiguration {
}