(defproject hello-world "0.1.0-SNAPSHOT"
  ;:description "FIXME: write description"
  ;:url "http://example.com/FIXME"
  ;:license {:name "Eclipse Public License"
  ;          :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2173"]]
  :plugins [[lein-cljsbuild "1.0.2"]]
  ;:source-paths ["src/clj"]
  :cljsbuild {
    :builds [{
      :source-paths ["src"]
      :compiler {
        :output-to "src/main.js"
        :optimizations :advanced
        :pretty-print true}}]})