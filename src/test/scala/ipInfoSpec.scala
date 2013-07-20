package me.itang

import org.scalatest.FunSpec
import net.liftweb.json.JsonAST._
import me.itang.iptaobao._

class IpInfoSpec extends FunSpec {

  describe("ipInfo method") {
    it("good ip 8.8.8.8's country_id is US") {
      assert((ipInfo("8.8.8.8") \ "country_id") === JString("US"))
    }

    it("bad ip 444.44 return JNothing") {
      assert((ipInfo("444.44") \ "country_id") === JNothing)
    }
  }
}
