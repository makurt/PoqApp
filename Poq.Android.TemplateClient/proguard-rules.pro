-dontwarn java.lang.invoke.*
-dontwarn com.squareup.okhttp.**
-dontwarn okio.**
-dontwarn com.adobe.mobile.*
-dontwarn com.google.android.gms.gcm.*

########--------Retrofit + RxJava--------#########
-dontwarn retrofit.**
-keep class retrofit.** { *; }
-dontwarn sun.misc.Unsafe
-dontwarn com.octo.android.robospice.retrofit.RetrofitJackson**
-dontwarn retrofit.appengine.UrlFetchClient
-dontwarn retrofit2.Platform$Java8
-keepattributes Signature
-keepattributes Exceptions
-keepclasseswithmembers class * {
    @retrofit.http.* <methods>;
}
-keep class com.google.gson.** { *; }
-dontwarn com.google.gson.**
-keep class com.google.inject.** { *; }
-keep class org.apache.http.** { *; }
-keep class org.apache.james.mime4j.** { *; }
-keep class javax.inject.** { *; }
-keep class retrofit.** { *; }
-dontwarn org.apache.http.**
-dontwarn android.net.http.AndroidHttpClient

-dontwarn sun.misc.**

-keepclassmembers class rx.internal.util.unsafe.*ArrayQueue*Field* {
    long producerIndex;
    long consumerIndex;
}
-keepclassmembers class rx.internal.util.unsafe.BaseLinkedQueueProducerNodeRef {
    rx.internal.util.atomic.LinkedQueueNode producerNode;
}
-keepclassmembers class rx.internal.util.unsafe.BaseLinkedQueueConsumerNodeRef {
    rx.internal.util.atomic.LinkedQueueNode consumerNode;
}

-keep class com.poqstudio.app.platform.model.** { *; }
-keep class com.poqstudio.app.platform.data.web.model.** { *; }
-keep class com.poqstudio.app.platform.data.network.model.** { *; }
-keep class com.poqstudio.app.platform.data.network.api.** { *; }
-keep class com.poqstudio.app.platform.data.memory.model.** { *; }
-keep class com.poqstudio.app.platform.view.contentBlocks.models.UIContentBlock { *; }

-keepclasseswithmembers class * {
    @retrofit2.http.* <methods>;
    }

########--------Crashlytics--------#########
-keepattributes *Annotation*
-keepattributes SourceFile,LineNumberTable

#######---------Dagger---------#########
-dontwarn com.google.errorprone.annotations.*

#######---------ReactiveNetwork---------#########
-dontwarn com.github.pwittchen.reactivenetwork.library.rx2.ReactiveNetwork
-dontwarn io.reactivex.functions.Function
-dontwarn rx.internal.util.**