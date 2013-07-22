package me.itang.iptaobao

import org.scalatest.FunSpec
import net.liftweb.json.JsonAST._

class IpInfoSpec extends FunSpec {

  describe("ipInfo method") {
    it("good ip 8.8.8.8's country_id is US") {
      val ret = ipInfo("8.8.8.8")
      assert(ret \ "country_id" === JString("US"))
      val JString(country) = ret \ "country"
      assert(country === "美国")
    }

    it("bad ip 444.44 return JNothing") {
      assert((ipInfo("444.44") \ "country_id") === JNothing)
    }
  }
}
