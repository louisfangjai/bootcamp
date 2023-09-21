class Solution {
    public int maxProfit(int[] prices) { //混埋時間去做，唔靜止淨係搵MAX MIN
    //創新低同之後日子先有profit
        int maxProfit=0;
        int buyDay=0;
        int currProfit=0;
        for(int i =1; i < prices.length; i++){ //**** */
            // 轉buy day，assume左第一日(0位)入貨，再比較
            if(prices[buyDay]>prices[i]){ //即有新低位>轉入貨
            buyDay=i;
            continue; //continue無問題諗case2，唔會有profit因為你唔可以day4買，day2 sell
            //無profit->唔洗做轉換
        }
        currProfit= prices[i]-prices[buyDay]; //即係大過buyday ->有profit//
        // if(currProfit>maxProfit)
        // maxProfit= currentProfit;
        maxProfit=Math.max(currProfit,maxProfit); //第一次curr=max//佢無郁過Buyday所以只係有再新低位先會轉換
        }
        return maxProfit;
    }
}