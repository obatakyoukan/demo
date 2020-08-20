# 動作確認用コマンド
- All json list 
```
curl http://localhost:8080 -i -XGET
```
- Find One json
```
curl http://localhost:8080/2 -i -XGET
```
- ADD Query
```
curl  http://localhost:8080 -i -XPOST -H "Content-Type: application/json" -d "{\"title\":\"Hokudai Tours\", \"place\":\"Hokkaido\",\"memo\":\"My University\"}"
```
- UPDATE Query
```
curl  http://localhost:8080/2 -i -XPUT -H "Content-Type: application/json" -d "{\"title\":\"Hokudai Tours AND Tokeidai\", \"place\":\"Hokkaido\",\"memo\":\"My University\"}"
```
- DELETE Query
```
curl http://localhost:8080/2 -i -XDELETE
```

