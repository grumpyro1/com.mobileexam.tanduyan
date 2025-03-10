plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    id("org.jetbrains.kotlin.plugin.serialization") version "1.9.10"
}

android {
    namespace = "com.example.commobileexamtanduyan"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.commobileexamtanduyan"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.gson)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.gson)
    implementation(libs.viewmodel)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    // added by me
    implementation(libs.coil.compose.v240)
    implementation(libs.androidx.lifecycle.viewmodel.compose)
    implementation(libs.retrofit2.kotlinx.serialization.converter)


    // Gson Converter (For Parsing JSON)
    implementation (libs.converter.gson)

    // OkHttp (For Logging API Requests & Responses)
    implementation (libs.logging.interceptor)

    // Coroutine Support for Retrofit (For Asynchronous Calls)
    implementation (libs.kotlinx.coroutines.android)

    // Retrofit
    implementation(libs.retrofit2.kotlinx.serialization.converter)
    implementation(libs.retrofit)
    implementation(libs.coil.compose.v270)
    implementation(libs.org.jetbrains.kotlinx.kotlinx.serialization.json)

    // Retrofit
        implementation(libs.retrofit.v290)
    // Retrofit with Scalar Converter
        implementation(libs.converter.scalars)
    // Retrofit with Kotlin serialization Converter

    implementation(libs.retrofit2.kotlinx.serialization.converter)
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    // Kotlin serialization
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.8.0")

    // navigation
    implementation(libs.androidx.navigation.compose) // Replace with the latest version
}