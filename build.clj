(ns build
  (:refer-clojure :exclude [test])
  (:require [clojure.tools.build.api :as b]
            [juxt.pack.jib :refer [jib]]))

(def lib 'net.clojars.kafka-deploy/kafka-deploy)
(def version "0.1.0-SNAPSHOT")
(def main 'kafka-deploy.kafka-deploy)

(defn docker [opts]
      (let []
           (jib {:basis (b/create-basis {:aliases [:build-config]
                                         :project "deps.edn"})
                 :base-image "gcr.io/distroless/java-debian10:11-debug-nonroot"
                 :image-name "gcr.io/breezeehr.com/breeze-ehr/kafka2"
                 :image-type :registry
                 :labels {}
                 :tags []})))