<template>
  <img alt="Vue logo" src="./assets/logo.png">
  <HelloWorld msg="안녕하세요? Springboot로 띄우는 Vue.js입니다."/>
  <h2>현재 Springboot와 Vue.js를 연결하고 Swaggger를 연결해서 api를 볼 수 있게 처리 했습니다.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@</h2>
  <a>추가로 GitHub를 연동하는데 성공했습니다.</a><br>
  <a>내용을 추가로 만들었어요</a>
  <a href="/example"><h1>example API 접속</h1></a>
  <a href="/moon"><h1>병창님 API 접속</h1></a>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'

export default {
  name: 'App',
  components: {
    HelloWorld
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
