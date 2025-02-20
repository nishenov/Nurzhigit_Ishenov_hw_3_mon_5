plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {
    namespace = "com.example.nurzhigit_ishenov_hw_3_mon_5"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.nurzhigit_ishenov_hw_3_mon_5"
        minSdk = 24
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures{
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    //Paging 3
    implementation("androidx.paging:paging-runtime-ktx:3.3.0")

    //Retrofit
    implementation ("com.squareup.retrofit2:retrofit:2.11.0")

    //Gson
    implementation("com.squareup.retrofit2:converter-gson:2.10.0")

    //glide
    implementation ("com.github.bumptech.glide:glide:4.16.0")
}