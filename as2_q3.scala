object question03{
    def main(args: Array[String]): Unit={
        var normal_WH = 40
        var OT_WH = 30
        var tax = 0.12
        println("Take home salary--------------------")
        println(s"Normal working hours : $normal_WH")
        println(s"OT working hours     : $OT_WH")
        println(s"Take home salary     : ${takeHomeSal(normal_WH , OT_WH, tax)}")
    }

    def normalSal(normal_WH:Int)={
        250*normal_WH
    }

    def OtSal(OT_WH:Int)={
        85*OT_WH
    }

    def takeHomeSal(normal_WH:Int, OT_WH:Int, tax:Double)={
        (normalSal(normal_WH) + OtSal(OT_WH))*(1-tax)
    }

}
