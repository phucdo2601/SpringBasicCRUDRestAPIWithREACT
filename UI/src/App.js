import "./App.css";

import { BrowserRouter as Router, Route, Switch } from "react-router-dom";
import FooterComponent from "./components/FooterComponent";
import HeaderComponent from "./components/HeaderComponent";
import ListEmployeeComponents from "./components/ListEmployeeComponents";
import CreateEmployeeComponent from "./components/CreateEmployeeComponent";
import UpdateEmployeeComponent from "./components/UpdateEmployeeComponent";
import ViewEmployeeComponent from "./components/ViewEmployeeComponent";

function App() {
  return (
    <div>
      <Router>
        <div className="container">
          <HeaderComponent />
            <div className="container">
              <Switch> 
                <Route path="/" exact component={ListEmployeeComponents}></Route>
                <Route path="/employees" component={ListEmployeeComponents}></Route>

                {/* step 1 */}
                <Route path="/add-employee/:id" component={CreateEmployeeComponent}></Route>
                <Route path="/view-employee/:id" component={ViewEmployeeComponent}></Route>
                {/* <Route path = "/update-employee/:id" component = {UpdateEmployeeComponent}></Route> */}
                <ListEmployeeComponents />
              </Switch>
            </div>
          <FooterComponent />
        </div>
      </Router>
    </div>
  );
}

export default App;
