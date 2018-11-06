(ns taipei-404.website.core)

(enable-console-print!)

(defn hello [] "Hello, wonderful world.")

;; Alter a DOM element to set some text inside.
(set! (.-innerHTML (js/document.getElementById "app"))
      (hello))

(println (hello))
