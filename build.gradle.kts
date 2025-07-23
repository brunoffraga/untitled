plugins {
    id("java")
    id("org.springframework.boot") version "3.2.4"
    id("io.spring.dependency-management") version "1.1.4"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-web")
    //
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.1.0")

    implementation("com.h2database:h2:2.1.214")
    //runtimeOnly("com.h2database:h2")
    implementation("org.postgresql:postgresql:42.7.3")
    //runtimeOnly("org.postgresql:postgresql")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}


//atenção se
tasks.jar {
    manifest {
        attributes["Main-Class"] = "org.example.SantanderDevWeekApplication"
    }
}

tasks.test {
useJUnitPlatform()
}

springBoot {
mainClass = "org.example.SantanderDevWeekApplication"
}