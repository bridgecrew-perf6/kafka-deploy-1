(ns user
  (:import (kafka Kafka)))

(defn start-kafka []
  (Kafka/main (into-array String ["server.properties"]))
  )