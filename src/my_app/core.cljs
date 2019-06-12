(ns my-app.core
  (:require [reagent.core :as r]))


(defn app []
  [:h1 "Hi there, earth!"])


(defn ^:dev/before-load stop []
  (js/console.log "Stopping..."))


(defn ^:dev/after-load start []
  (js/console.log "Starting...")
  (r/render [app]
            (.getElementById js/document "app")))


;; Use ^:export so that function name doesn't get munged with advanced compilation
(defn ^:export init []
  (start))
