import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class RoomSpec extends AnyFlatSpec with should.Matchers{

  behavior of "Room"

  it should "allow people to enter" in {
    val room = new Room("Kitchen", 10)
    val actual = room.enter(10)
    val expected = true
    actual shouldBe expected
  }

  it should "allow people to leave" in {
    val room = new Room("LivingRoom", 15)
    val actual = room.leave(16)
    val expected = false
    actual shouldBe expected
  }

}
