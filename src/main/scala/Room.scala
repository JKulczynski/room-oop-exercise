class Room(roomName: String, capacity: Int) {

  var occupied = 0

  def enter(newPeople: Int): Boolean = {
    if (newPeople + occupied > capacity) return false
    else occupied += newPeople
    true
  }

  def leave(leavingPeople: Int): Boolean = {
    if (occupied - leavingPeople < 0) false
    else {
      occupied -= leavingPeople
      true
    }
  }

  val report = println(s"in $roomName is occupied by $occupied people")
}
