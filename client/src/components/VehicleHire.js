import axios from "axios";
import Datepicker from "vuejs-datepicker/dist/vuejs-datepicker.esm.js";

export default {
  name: 'VehicleHire',
  props: {
    msg: String
  }, 
  data: function() {
    return {
      showVehicles: false,
      showCosts: false,
      counter: 0,
      vehicles: [],
      startDate: undefined,
      endDate: undefined,
      vehicleType: undefined,
      totalCost: 0,
    }
  },
  components: {
    Datepicker
  },
  methods: {
    selectVehicle: function(elem) {
      this.vehicleType=elem;
      console.log('selectVehicle: '+elem);

    },
    setStartDate: function(elem) {
      var d = new Date(elem);
      this.startDate=d;
      console.log('setStartDate: '+d.toDateString());
    },
    setEndDate: function(elem) {
      var d = new Date(elem);
      this.endDate=d;
      console.log('setEndDate: '+d.toDateString());
    },
    getVehiclesAvailable: function () {
      console.log("getData");
      this.showCosts=false;
      this.showVehicles=true;
      axios
        .get('http://localhost:8080/vehicles/available')
        .then(response=>(
          this.vehicles=response.data
        ));  
    },
    getVehicesByDate: function() {
      console.log('startDate'+this.startDate);
      console.log('toDate'+this.endDate);
      this.showCosts=true;
      this.showVehicles=false;
      axios
        .get('http://localhost:8080/vehicles/hirecost/'+this.vehicleType+'/'+this.formatDate(this.startDate)+'/'+this.formatDate(this.endDate))
        .then(response=>(
          this.totalCost=response.data
        ));  
    },
    formatDate: function(date) {
      var d = new Date(date),
          month = '' + (d.getMonth() + 1),
          day = '' + d.getDate(),
          year = d.getFullYear();
  
      if (month.length < 2) 
          month = '0' + month;
      if (day.length < 2) 
          day = '0' + day;
  
      return [year, month, day].join('-');
    }
  },
  mounted() {
    console.log("Mounted");
  }
}
