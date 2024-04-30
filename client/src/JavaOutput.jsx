import React, {useState} from 'react'
import axios from 'axios'

const JavaOutput = () => {
  const [output, setOutput] = useState('')
  const handleButtonClick = async () => {
    try {
      const response = await axios.get('http://localhost:8080/hello');
      console.log(response);
      setOutput(response.data)
    } catch (error) {
      console.log(error);
    }
  }
  return (
    <div>
            <button onClick={handleButtonClick}>Execute Java Program</button>
            <p>Output: {output}</p>
        </div>
  )
}

export default JavaOutput
