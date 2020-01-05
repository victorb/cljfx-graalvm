(defproject cljfx-graalvm "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.10.1-patch_38bafca9_clj_1472_3"]
                 [cljfx "1.6.1"]]
  :plugins [[io.taylorwood/lein-native-image "0.3.1"]]
  :native-image {:name "cljfx-graalvm"
                 :graal-bin "/home/user/Downloads/graalvm-ce-java11-19.3.0.2"
                 :opts ["--verbose"
                        "--report-unsupported-elements-at-runtime"
                        "--initialize-at-build-time"
                        "-H:+ReportExceptionStackTraces"
                        "-H:+TraceClassInitialization"
                        "--no-server"
                        "--no-fallback"]}
  :main ^:skip-aot cljfx-graalvm.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :injections [(javafx.application.Platform/exit)]}})
