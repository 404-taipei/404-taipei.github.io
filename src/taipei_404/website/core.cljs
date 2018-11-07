(ns taipei-404.website.core
  (:require [reagent.core :as r]))

(enable-console-print!)

(defn hello []
  [:div.green "Hello, wonderful world."])

(defn centered-logo []
  [:div {:style {:display :flex
                 :justify-content :center
                 :align-items :center
                 :height :100vh}}
   [:img {:src "img/404-taipei.svg"}]])

(defn app-view []
  [:div
   ;[hello]
   [centered-logo]])

(defn ^:export run []
  (r/render [app-view]
            (js/document.getElementById "app")))

(run)
