(defproject sandbox "0.1.0-SNAPSHOT"
  :description "Free your sandbox using Docker!"
  :url "http://github.com/thieman/sandbox-in-docker"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/tools.logging "0.2.6"]
                 [org.clojure/core.async "0.1.262.0-151b23-alpha"]
                 [com.keminglabs/zmq-async "0.1.0"]
                 [clj-http "0.7.8"]
                 [cheshire "5.2.0"]
                 [compojure "1.1.5"]
                 [ring/ring-jetty-adapter "1.2.1"]
                 [ring/ring-json "0.2.0"]]
  :profiles {:master {:main sandbox.master}
             :worker {:main sandbox.worker}})
