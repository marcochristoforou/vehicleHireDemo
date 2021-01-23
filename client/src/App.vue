<template>
  <div id="app">
    <VehicleHire msg="Welcome Car Hire App"/>
  </div>
</template>

<script>
import VehicleHire from './components/VehicleHire.vue'

export default {
  name: 'App',
  components: {
    VehicleHire
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
