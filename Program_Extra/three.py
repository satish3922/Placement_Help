from __future__ import division
# from decimal import Decimal
n = int(input('Enter N :'))
quantity = [10,25,50,100,500]
quantity1 = [10,25,50,100,500]
quantity2 = [10,25,50,100,500]
price = [27.32,13.13,21.25,18.00,15.50]

if n in quantity:
    index = quantity.index(n)
    print(price[index])
elif n not in quantity:
        if n > max(quantity):
            #============================================ MAX ===========================================
            # max price1
            max1 = max(quantity1)
            price_max1 = price[quantity.index(max1)]
            quantity1.remove(max1)
            # max price2
            max2 = max(quantity1)
            price_max2 = price[quantity.index(max2)]
            # max quantity difference
            diff_quantity_max = max1 - max2
            # price difference
            diff_price_max = max([price_max1,price_max2]) - min([price_max1,price_max2])
            # difference from
            diff_from_n1 = n-max1
            diff_from_n2 = n-max2

            multiplier1 = diff_from_n1/diff_quantity_max
            multiplier2 = diff_from_n2/diff_quantity_max
            res = price_max1-multiplier1*diff_price_max
            print(round(res,2))

        elif n < min(quantity):
            #============================================= MIN ==========================================
            min1 = min(quantity2)
            price_min1 = price[quantity.index(min1)]
            quantity2.remove(min1)

            min2 = min(quantity2)
            price_min2 = price[quantity.index(min2)]

            diff_quantity_min = min2 - min1
            diff_price_min = max([price_min1,price_min2]) - min([price_min1,price_min2])
            diff_from_m1 = min1-n
            diff_from_m2 = min2-n


            multiplier1 = diff_from_m1/diff_quantity_min
            multiplier2 = diff_from_m2/diff_quantity_min
            res = price_min1-multiplier1*diff_price_min
            # print(diff_quantity_min)
            # print(price_min1)
            # print(multiplier1)
            # print(diff_price_min)
            # print("{}|{}".format(price_min1,price_min2))
            print(round(res,2))
