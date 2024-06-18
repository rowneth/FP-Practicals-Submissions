// q1
def area(radius: Double): Double = math.Pi * radius * radius

// q2
def celsiusToFahrenheit(celsius: Double): Double = celsius * 1.8 + 32.0

// q3
def sphereVolume(radius: Double): Double = (4.0 / 3.0) * math.Pi * math.pow(radius, 3)

// q4
def wholesaleCost(copies: Int): Double = {
  val bookPrice = 24.95
  val discountRate = 0.4
  val shippingBaseCost = 3.0
  val shippingPerCopy = 0.75
  
  val discountedPrice = bookPrice * (1 - discountRate)
  val totalShippingCost = if (copies <= 50) shippingBaseCost * copies else 50 * shippingBaseCost + (copies - 50) * shippingPerCopy
  
  discountedPrice * copies + totalShippingCost
}

// q5
def easyPaceTime(distance: Double): Double = 8 * distance
def tempoPaceTime(distance: Double): Double = 7 * distance
def totalRunTime(d1: Double, d2: Double, d3: Double): Double = easyPaceTime(d1) + tempoPaceTime(d2) + easyPaceTime(d3)
