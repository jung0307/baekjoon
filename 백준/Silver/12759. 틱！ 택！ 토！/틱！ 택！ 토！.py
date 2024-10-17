game = [[' '] * 3 for _ in range(3)]

player = int(input())
while 1:
    x, y = map(int,input().split())
    x-=1
    y-=1
    winner = 0
    
    if player == 1: game[x][y] = 'O'
    else: game[x][y] = 'X'
    res = []
    for i in range(3):
        res.append([game[i][0], game[i][1], game[i][2]])
    
    for i in range(3):
        res.append([game[0][i], game[1][i], game[2][i]])
    
    res.append([game[0][0], game[1][1], game[2][2]])
    res.append([game[0][2], game[1][1], game[2][0]])
    
    if ['O', 'O', 'O'] in res: winner = 1
    if ['X', 'X', 'X'] in res: winner = 2
    
    if winner == 0:
        flag = False 
        for i in range(len(res)):
            if ' ' in res[i]: flag = True
        if not flag: winner = 3

    if winner > 0: break
    
    if player == 1: player = 2
    else: player = 1

if winner < 3: print(winner)
else: print(0)