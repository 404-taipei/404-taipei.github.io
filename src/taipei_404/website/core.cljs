(ns taipei-404.website.core
  (:require [reagent.core :as r]))

(enable-console-print!)

(defn hello []
  [:div.red "Hello, wonderful world."])

(defn ^:export run []
  (r/render [hello]
            (js/document.getElementById "app")))

(run)
