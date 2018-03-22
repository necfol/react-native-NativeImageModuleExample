# react-native-NativeImageModuleExample

新建一个RN项目，依次运行:

```
$ npm install --save react-native-nativeimagemoduleexample
$ npm install
$ react-native link
```
在js中新增代码:

```javascript
import NativeImageModule from 'react-native-nativeimagemoduleexample';
<!--在render中-->
<NativeImageModule src={[{uri:'http://f.named.cn/f/45de9752d88841c87da0f23f8a798a4c.jpg'}]} style={styles.image}/>
```
运行:
```
$ react-native run-android
```
可参考[示例](https://github.com/necfol/react-native-NativeImageModuleExample/tree/master/example)
