<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <button type="button" class="btn btn-primary" v-on:click="getVehiclesAvailable">
      Get All Vehicles
    </button>
    <br />
    <br />
    <p class="strong">
      OR
    </p>
    <p class="strong">
      Calculate Cost of A Vehicle for Seleted Dates
    </p>
    <div class="form-check form-check-inline">
      <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio1" 
      value="option1" v-on:change="selectVehicle('SMALL')">
      <label class="form-check-label" for="inlineRadio1">Small</label>
    </div>
    <div class="form-check form-check-inline">
      <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio2" 
      value="option2" v-on:change="selectVehicle('ESTATE')">
      <label class="form-check-label" for="inlineRadio2">Estate</label>
    </div>
    <div class="form-check form-check-inline">
      <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio3" 
      value="option3"  v-on:change="selectVehicle('VAN')">
      <label class="form-check-label" for="inlineRadio3">Van</label>
    </div>
    <p>
      <label>Start Date</label>
      <datepicker class="text-center" :format="format" v-on:selected="setStartDate"></datepicker>
      <br>
      <label>End Date</label>
      <datepicker class="text-center" :format="format" v-on:selected="setEndDate"></datepicker>
    </p>
    <button type="button" class="btn btn-primary" v-on:click="getVehicesByDate">
      Get Cost
    </button>
    &nbsp;
    &nbsp;
    <br />
    <br />
    <p>Results</p>
    <div :style="{display: showCosts ? 'block' : 'none'}">
      <p>
        Total Cost £ {{ totalCost }}
      </p>
    </div>
    <div :style="{display: showVehicles ? 'block' : 'none'}">
      List of Available Vehicles
      <ul class="list-group">
        <li class="list-group-item" v-for="item in vehicles" :key="item.regNumber">
          {{ item.regNumber }}
        </li>
      </ul>
    </div>
  </div>
</template>

<script src="./HelloWorld.js"></script>
<style scoped src="./HelloWorld.css"></style>

