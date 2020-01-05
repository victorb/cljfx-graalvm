(ns cljfx-graalvm.core
  (:require [cljfx.api :as fx])
  (:import [javafx.application Platform])
  (:gen-class))

(defn start-gui []
  (fx/on-fx-thread
    (fx/create-component
      {:fx/type :stage
       :showing true
       :title "Cljfx example"
       :width 300
       :height 100
       :scene {:fx/type :scene
               :root {:fx/type :v-box
                      :alignment :center
                      :children [{:fx/type :label
                                  :text "Hello world"}]}}})))

(defn -main
  [& args]
  (Platform/setImplicitExit true)
  (start-gui))
