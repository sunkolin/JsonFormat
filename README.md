## JsonFormat

### TODO

- 格式化字符串加上颜色
- 生成对象，生成类后直接放在输入框
- 复制对象，生成类后复制到剪贴板
- 自定义生成对象，可以设置一下字段名，类型等
- 设置，可以设置是否使用lombok等，是否添加注释，默认添加，格式：字段名，例如xxx，是否序列号，默认序列号；下划线转驼峰格式，默认生效； 
使用包装类型，默认使用；生成对象后缀，默认使用Model；数据默认类型：数字默认Long，字符串默认String，日期默认Date，小数默认Double;


### 测试用例

```json
{
    "name": "王五", "gender": "man",
    "age": 15,
    "height": "140cm",
    "addr": {
        "province": "fujian",
        "city": "quanzhou",
        "code": "300000"
    },
    "hobby": [
        {
            "name": "billiards",
            "code": "1"
        },
        {
            "name": "computerGame",
            "code": "2"
        }
    ],
    "list": [1,2,3,4],
    "_r":0,
    "err":"None",
    "photo":"http://xxxx.com/photo.jpg"
}
```
