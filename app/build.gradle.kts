plugins {
    alias(libs.plugins.android.application)
    //Implementacion de complementos de google-service. La app utiliza los dependias de GoogleService.
    id ("com.google.gms.google-services")
}

android {
    namespace = "com.example.semana_13_firebase"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        applicationId = "com.example.semana_13_firebase"
        minSdk = 31
        targetSdk = 36
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
}

dependencies {
    // Implementar dependencias BOM para que automaticamente se descargue la version compatible de los servicios de firebase.
    implementation(platform("com.google.firebase:firebase-bom:34.6.0"))
    // Implementar dependencia de google para servicio especifico de FireBase"
    // Sin version ya que en controlada por el BOM.
    implementation("com.google.firebase:firebase-analytics")
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}