def rec_fun(a) :
    if a <=0:
        return 1
    return 1 + rec_fun(a-2)
def rec_fun(a, b) :
    if a <= 0 or b <= 0:
        print(rec_fun(a) + rec_fun(b) )
        rec_fun(a-b, b-a)
rec_fun(4, 2)
