(ns build
  (:refer-clojure :exclude [test])
  (:require [clojure.tools.build.api :as b]
            [jibbit.core :as jibbit]))

(def lib 'net.clojars.kafka-deploy/kafka-deploy)
(def version "0.1.0-SNAPSHOT")
(def main 'kafka-deploy.kafka-deploy)

(defn docker [opts]
      (let []
           (jibbit/build {})))